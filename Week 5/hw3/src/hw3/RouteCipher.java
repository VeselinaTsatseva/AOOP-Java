package hw3;

public class RouteCipher {
    private int key;

    public RouteCipher(int key) {
        setKey(key);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key != 0 ? key : 1;
    }

    public String encrypt(String plainText) {
        // записваме текста в масив като пропускаме празните места
        char[] plainTextArray = plainText.replace(" ", "").toCharArray();
        // брой колони според абсолютната стойност на ключа
        int cols = Math.abs(key);
        // брой редове според дължината на текста
        double rows = Math.ceil(plainTextArray.length / (double) cols);
        // създаваме матрица от char-ове
        char[][] textBLock = new char[(int)rows][cols];
        int counter = 0;

        // записваме текста в матрица
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (counter > plainTextArray.length - 1) {
                    textBLock[i][j] = 'X';
                } else {
                    textBLock[i][j] = plainTextArray[counter];
                }
                counter++;
            }
        }

        String encryptedText = new String();
        // обхождаме според ключа
        if (key > 0) {
            int k = 0, l = 0;
            int elementsInBlock = (int)rows * cols;
            rows--;
            cols--;

            while (k <= rows && l <= cols) {
                for (int i = k; i <= rows; i++) {
                    encryptedText += textBLock[i][l];
                }
                l++;
                if (encryptedText.length() == elementsInBlock) break;

                for (int i = l; i <= cols; i++) {
                    encryptedText += textBLock[(int)rows][i];
                }
                rows--;

                for (int i = (int)rows; i >= k; i--) {
                    encryptedText += textBLock[i][cols];
                }
                cols--;

                for (int i = cols; i >= l; i--) {
                    encryptedText += textBLock[k][i];
                }
                k++;
            }
        } else if (key < 0){
            int k = 0, l = 0;
            int elementsInBlock = (int)rows * cols;
            rows--;
            cols--;

            while (k <= rows && l <= cols) {
                for (int i = (int) rows; i >= k; i--) {
                    encryptedText += textBLock[i][cols];
                }
                cols--;

                for (int i = cols; i >= l; i--) {
                    encryptedText += textBLock[k][i];
                }
                k++;
                if (encryptedText.length() == elementsInBlock) break;

                for (int i = k; i <= rows; i++) {
                    encryptedText += textBLock[i][l];
                }
                l++;

                for (int i = l; i <= cols; i++) {
                    encryptedText += textBLock[(int) rows][i];
                }
                rows--;
            }
        }
        return encryptedText;
    }

    // попълва матрицата с криптиран текст
    public char[][] spiral(char[][] textBlock, char[] cipherTextArray, int rows, int cols){
        int k = 0, l = 0, counter = 0;
        rows--;
        cols--;

        while (k <= rows && l <= cols) {
            for (int i = k; i <= rows; i++) {
                textBlock[i][l] = cipherTextArray[counter];
                counter++;
            }
            l++;

            for (int i = l; i <= cols; i++) {
                textBlock[rows][i] = cipherTextArray[counter];
                counter++;
            }
            rows--;

            for (int i = rows; i >= k; i--) {
                textBlock[i][cols] = cipherTextArray[counter];
                counter++;
            }
            cols--;

            for (int i = cols; i >= l; i--) {
                textBlock[k][i] = cipherTextArray[counter];
                counter++;
            }
            k++;
        }
        return textBlock;
    }

    public String decrypt(String cipherText) {
        char[] cipherTextArray = cipherText.toCharArray();
        int rows = Math.abs(key);
        int cols = cipherTextArray.length / rows;
        char[][] textBlock = new char[rows][cols];

        // записваме шифрования текст в матрица
        textBlock = spiral(textBlock, cipherTextArray, rows, cols);

        String decryptedText = new String();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                decryptedText += textBlock[i][j];
            }
        }
        return decryptedText;
    }
}