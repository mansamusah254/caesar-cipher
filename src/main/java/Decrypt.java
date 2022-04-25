public class Decrypt {
    private final String mInputString;
    private int mShift;

    public Decrypt(String mInputString, int mShift) {
        this.mInputString = mInputString;
        this.mShift = mShift;
    }

    public String getmInputString(){
        return mInputString;
    }

    public int getmShift(){
        return mShift;
    }

    public static String decrypt(Decrypt decrypt){

        if(decrypt.mShift > 26){
            decrypt.mShift = decrypt.mShift % 26;
        }
        else if(decrypt.mShift < 0) {
            decrypt.mShift = (decrypt.mShift % 26) + 26;
        }

        StringBuilder outputString = new StringBuilder();
        int length = decrypt.mInputString.length();
        for (int i = 0; i < length ; i++) {
            char cc = decrypt.mInputString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc-decrypt.mShift);
                    if(c<'a'){
                        outputString.append((char) (cc + (26 - decrypt.mShift)));
                    }
                    else {
                        outputString.append(c);
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc-decrypt.mShift);
                    if(c<'A'){
                        outputString.append((char) (cc + (26 - decrypt.mShift)));
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
