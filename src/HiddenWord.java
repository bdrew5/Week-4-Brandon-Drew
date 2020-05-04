public class HiddenWord {
    private String word;
    public HiddenWord(String word){
        this.word=word;
    }
    public String getHint(String guess){
        String hint = "";
        boolean isIn = false;
        for(int i = 0; i<word.length();i++){
            if(word.substring(i,i+1).equals(guess.substring(i,i+1))){
                hint+= "" + word.substring(i,i+1);
            }
            else if(word.indexOf(guess.substring(i,i+1)) == -1){
                    hint+="+";
                }
                else {
                hint += "*";

            }
            }

        return hint;
    }
    public static void main(String[] args) {
        HiddenWord puzzel = new HiddenWord("HARPS");
        System.out.println(puzzel.getHint("AAAAA"));
        System.out.println(puzzel.getHint("HELLO"));
        System.out.println(puzzel.getHint("HEART"));
        System.out.println(puzzel.getHint("HARMS"));
        System.out.println(puzzel.getHint("HARPS"));

    }
}
