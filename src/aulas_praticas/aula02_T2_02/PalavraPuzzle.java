package aulas_praticas.aula02_T2_02;


public class PalavraPuzzle {
	private String palavra;
	private int x;
	private int y;
	private Direction direction;
	public final int length;
	
	public PalavraPuzzle(String palavra,int x, int y, Direction d) throws Exception {
		
		palavra = palavra.trim();
		if (!palavra.matches("[a-zA-Z]+") || palavra.length() < 2 || palavra.length() > 80) {
			throw new Exception("S� palavras com caracteres alfab�ticos");
		}
		this.palavra = palavra;
		this.x = x;
		this.y = y;
		length = palavra.length();
		direction = d;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public String getPalavra() {
		return palavra;
	}
	
	public boolean intercepts(PalavraPuzzle outrapalavra) {
		
		int x = this.x;
		int y = this.y;
		int xinc = this.direction.x;
		int yinc = this.direction.y;
		
		int x2 = outrapalavra.getX();
		int y2 = outrapalavra.getY();
		int x2inc = outrapalavra.getDirection().getX();
		int y2inc = outrapalavra.getDirection().getY();
		
		for(int i = 0; i < palavra.length();i++) {
			for (int j = 0; j < outrapalavra.length;j++) {
				//System.out.println( palavra + " (" + (x+i*xinc) + "," + (y+i*yinc) + ")" + " " +
						//outrapalavra.getPalavra() + " (" + (x2+j*x2inc) + "," + (y2+j*y2inc) + ")");
				if( (x+i*xinc)==(x2+j*x2inc) && (y+i*yinc)==(y2+j*y2inc) ) {
					return true;
				}
			}
		}
		
		
		return false;
	}

	public enum Direction {
		
		NONE(0,0),LEFT(-1,0),RIGHT(1,0),DOWN(0,1),
		UP(0,-1),DOWNLEFT(-1,1),DOWNRIGHT(1,1),UPLEFT(-1,-1),UPRIGHT(1,-1);
		
		private final int x;
		private final int y;
		
		private Direction(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		public int getX() {return x;}
		public int getY() {return y;}
	}
	
	public static Direction getRandomDirection() {
		
		double a= Math.random()*8;
		switch((int) a){
		case 0:
			return Direction.LEFT;
		case 1:
			return Direction.RIGHT;
		case 2:
			return Direction.DOWN;
		case 3:
			return Direction.UP;
		case 4:
			return Direction.DOWNLEFT;
		case 5:
			return Direction.DOWNRIGHT;
		case 6:
			return Direction.UPLEFT;
		case 7:
			return Direction.UPRIGHT;
		default:
			return Direction.NONE;
		}
		//return Direction.NONE;
	}
}
