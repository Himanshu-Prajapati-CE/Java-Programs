//Solve the tower of hanoi puzzle
public class TowerOfHanoiPuzzleUsingRecursion {
	public static void main(String[] args) {
		int n = 3; //Number of Disk
		towerOfHanoi(n,'A','C','B'); 
		//A = Source road, B = Auxiliary road, and C = Destination road
	}

	private static void towerOfHanoi(int n, char source, char desti, char auxi) 
	{
		if(n==1)
		{
			System.out.println("Move "+n+" Disk from "+source+" to "+desti);
			return;
		}
		{
			towerOfHanoi(n-1, source, auxi, desti);
			System.out.println("Move "+n+" Disk from "+source+" to "+desti);
			towerOfHanoi(n-1, auxi, desti, source);
		}
	}
}
