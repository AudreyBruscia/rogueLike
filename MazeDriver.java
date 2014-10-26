import java.util.*;

public class MazeDriver 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String keyChoice = "";
		boolean lose = false;
		//int[] data = new int[7];   //adding more goblins later
		//data[1] = 15; data[2] = 60; //goblin 1 x and y
		//data[3] = 8; data[4] = 14; //goblin 2 x and y
		int x = 13, y = 10;  //initial position of @
		Maze myMaze = new Maze();
		char[][] maze = myMaze.buildMaze();
		myMaze.printMaze();
		
		    while(!lose && scan.hasNext()) //
		    {
		    	lose = myMaze.moveGoblin(maze);  //goblin still moves for invalid character choice
		    	//lose = myMaze.moveGoblin(maze, data[1], data[2]);
		    	//lose = myMaze.moveGoblin(maze, data[3], data[4]);
		    	keyChoice = scan.next();
				switch(keyChoice)
				{
					case "w":
						if(maze[x - 1][y] == '.')
						{
							maze[x - 1][y] = '@';
							maze[x][y] = '.';
							x = x - 1;
						}
						break;
					case "a":
						if(maze[x][y - 1] == '.')
						{
							maze[x][y - 1] = '@';
							maze[x][y] = '.';
							y = y - 1;
						}
						break;
					case "d":
						if(maze[x][y + 1] == '.')
						{
							maze[x][y + 1] = '@';
							maze[x][y] = '.';
							y = y + 1;
						}
						break;
					case "s":
						if(maze[x + 1][y] == '.')
						{
							maze[x + 1][y] = '@';
							maze[x][y] = '.';
							x = x + 1;
						}
						break;
					default:
						System.out.println("Invalid character choice.");
						
				} //end switch
				
				
				myMaze.printMaze();

			}//end while
			//scan.close();
		    System.out.println("You lose.");
			
	} //end main

}
