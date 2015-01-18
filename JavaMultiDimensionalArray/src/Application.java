
public class Application
    {
    public static void main(String[] args)
        {
        // one dimensional array
        int[] values =
            {
            3, 5, 2343
            };

        System.out.println(values[2]);

        //2d array
        int[][] grid =
            {
                {
                3, 5, 2343
                },
                {
                2, 4
                },
                {
                1, 2, 3, 4
                }
            };
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        String[][] texts = new String[2][3];
        texts[0][1] = "Hello There";
        System.out.println(texts[0][1]);

        for (int i = 0; i < grid.length; i++)
            {
            for (int j = 0; j < grid[i].length; j++)
                {
                System.out.print(grid[i][j] + "\t");
                }
            System.out.println();
            }
        String[][] words = new String[2][];
        System.out.println(words[0]);
        words[0] = new String[3];
        words[0][1] = "hi there";
        System.out.println(words[0][1]);

        }
    }
