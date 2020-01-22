package aulas_praticas.aula04_T2_01;

public class Controller implements JGaloInterface{
	private final int gameBoard=4;
    private char player;
    private int jogadaNumber;
    private char[][] coord;
    private char ganhou;

    public Controller() {
        this.player='X';
        coord= new char[gameBoard][gameBoard];
        jogadaNumber=0;
    }

    @Override
    public char getActualPlayer() {
        if(jogadaNumber%2==0){
            this.player='X';
        }
        else{
            this.player='O';
        }
        jogadaNumber++; //passa para o jogador seguinte
        return player;
    }

    @Override
    public boolean setJogada(int lin, int col) {
        if(lin>gameBoard || col>gameBoard){
            return false;
        }
        if(player=='X'){
            coord[lin][col]='X';
        }
        if(player=='O'){
            coord[lin][col]='O';
        }
        return true;
    }

    @Override
    public boolean isFinished() {
        if(jogadaNumber==9){
            return true;
        } 
        if(coord[1][1]=='X' && coord[2][2]=='X'&& coord[3][3]=='X'||//diagonal
                coord[3][1]=='X' && coord[2][2]=='X'&& coord[1][3]=='X'||
                coord[1][1]=='X' && coord[1][2]=='X'&& coord[1][3]=='X'||//horizontal
                coord[2][1]=='X' && coord[2][2]=='X'&& coord[2][3]=='X'||
                coord[3][1]=='X' && coord[3][2]=='X'&& coord[3][3]=='X'||
                coord[1][1]=='X' && coord[2][1]=='X'&& coord[3][1]=='X'||//vertical
                coord[1][2]=='X' && coord[2][2]=='X'&& coord[3][2]=='X'||
                coord[1][3]=='X' && coord[2][3]=='X'&& coord[3][3]=='X'
                ){
            ganhou='X';
            return true;      
        }    
        if(coord[1][1]=='O' && coord[2][2]=='O'&& coord[3][3]=='O'||//diagonal
                coord[3][1]=='O' && coord[2][2]=='O'&& coord[1][3]=='O'||
                coord[1][1]=='O' && coord[1][2]=='O'&& coord[1][3]=='O'||//horizontal
                coord[2][1]=='O' && coord[2][2]=='O'&& coord[2][3]=='O'||
                coord[3][1]=='O' && coord[3][2]=='O'&& coord[3][3]=='O'||
                coord[1][1]=='O' && coord[2][1]=='O'&& coord[3][1]=='O'||//vertical
                coord[1][2]=='O' && coord[2][2]=='O'&& coord[3][2]=='O'||
                coord[1][3]=='O' && coord[2][3]=='O'&& coord[3][3]=='O'
                ){
            ganhou='O';
            return true;      
        }    
      return false;  
    }

    @Override
    public char checkResult() {
        if(ganhou=='X'){
            return 'X';
        }
        if(ganhou=='O'){
            return 'O';
        }
        else{
            return ' ';
        }
        
    } 

}
