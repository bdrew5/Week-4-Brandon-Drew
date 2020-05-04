public class TokenPass
{
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        board = new int[playerCount];
        currentPlayer = (int)Math.random() * playerCount;
        for (int i = 0; i<playerCount; i++){
            board[i] = (int)(Math.random()*10) + 1;
        }

    }

    public void distributeCurrentPlayerTokens() {
        int tokens = board[currentPlayer];
        int playerNum = currentPlayer + 1;
        board[currentPlayer] = 0;
        while (tokens != 0){
            if(playerNum >= board.length)
                playerNum = 0;
            board[currentPlayer]++;
            tokens--;
        }
    }
}
