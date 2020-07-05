/**
 * Compilation: javac MM1Queue.java
 * Execution: java MM1Queue lambda mu
 * Dependencies: Queue.java Histogram.java
 *
 * Simulate an M/M/1 queue where arrivals and depatures are Poisson
 * processes with arival rate lambda and service rate mu
 *
 * This code is from intro.cs.princeton.edu
 * Writing this code, is to better understand how it works
 */

 public class MM1Queue{


   public static void main(String[] args){

     double lambda = Double.parseDouble(args[0]); //arrival rate
     double mu     = Double.parseDouble(args[1]); //service rate


     Queue<Double> queue = new Queue<Double>();
     double nextArrival = StdRandom.exp(lambda);
     double nextDeparture = Double.POSITIVE_INFINITY;

     //double expectedWait = 1.0 / (mu - lambda);

     double totalWait = 0.0;
     long customersServiced = 0;

     //histogram object
     Histogram hist = new Histogram(60 + 1);

     StdDraw.setCanvasSize(1000, 600);
     StdDraw.enableDoubleBuffering();

     //simulate an M/M/1 queue
     while(true){

       if(nexztArrival <= nextDeparture){
         if(queue.isEmpty()){
           nextDeparture = nextArrival + StdRandom.exp(mu);
           queue.enqueue(nextArrival);
           nextArrival += StdRandom.exp(lambda);
         }
       }

       else{
         double wait = nextDeparture - queue .dequeue();
         hist.addDataPoint(Math.min(60, (int) (Math.round(wait))));
         totalWait += wait;
         customersServiced ++;
         StdDraw.clear();
         hist.draw();
         StdDraw.show();
         StdDraw.pause(30);
         if(queue.isEmpty()) nextDeparture = Double.POSITIVE_INFINITY;
         else                nextDeparture += StdRandom.exp(mu);
       }
     }
   }
 }
