public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(100000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
         SimMonty m = new SimMonty(); //0 stay, 1 switch, 2 random
         //loop for my strategies
        for(int i = 0; i <= 2; i++){
            int countRuns = 0;
            int strategy = 0;
            strategy = i;
            myWinTotal = 0;
         //you write this
            while(countRuns < numGames){
                myWinTotal += m.playGame(strategy);
                countRuns++;
            }
                System.out.println((myWinTotal * 1.0)/numGames);

        }
         //stop here...   
          }
        }

