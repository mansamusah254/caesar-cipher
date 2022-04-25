public class Encrypt {
    private final String mInputString;
    private int mShift;

    public String getmInputString(){
        return mInputString;
    }

    public int getmShift(){
        return mShift;
    }

    public Encrypt(String mInputString, int mShift) {
        this.mInputString = mInputString;
        this.mShift = mShift;
    }

    public static String encrypt(Encrypt encrypt){

        if(encrypt.mShift > 26){
            encrypt.mShift = encrypt.mShift % 26;
        }
        else if(encrypt.mShift < 0) {
            encrypt.mShift = (encrypt.mShift % 26) + 26;
        }

        StringBuilder outputString = new StringBuilder();
        int length = encrypt.mInputString.length();
        for (int i = 0; i < length ; i++) {
            char cc = encrypt.mInputString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc+encrypt.mShift);
                    if(c>'z'){
                        outputString.append((char) (cc - (26 - encrypt.mShift)));
                    }
                    else {
                        outputString.append(c);
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc+encrypt.mShift);
                    if(c>'Z'){
                        outputString.append((char) (cc - (26 - encrypt.mShift)));
                    }
                    else {
                        outputString.append(c);
                    }
                }
            }
            else{
                outputString.append(cc);
            }
        }
        return outputString.toString();
    }
}
