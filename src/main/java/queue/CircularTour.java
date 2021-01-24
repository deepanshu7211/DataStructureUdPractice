package queue;

public class CircularTour {
    public static void main(String[] args) {
        int n=4;
        int p[] = {4 ,6, 7, 4};
        int d[] = {6, 5, 3, 5};


        int start = printTour(p,d, p.length);

        System.out.println(start == -1 ? "No Solution" : "Start = " + start);
    }

    // The function returns starting point if there is a possible solution,
    // otherwise returns -1
    static int printTour(int petrol[],int distance[], int n)
    {
        //1)Check if a solution exists , ie there's enough petrol to cover all the stattions.

//        int n = petrol.length;
        int balance = 0;
        for(int i=0;i<n;i++)
            balance+= petrol[i] - distance[i];

        if(balance<0) return -1; //We dont have enough petrol.

        //2)To find out from which index to start.

        balance = 0;
        int start=0;
        for(int i=0;i<n;i++)
        {
            balance+= petrol[i] - distance[i];
            //If there isnt sufficient balance to proceed further
            //, move to next index and start from there.
            if(balance<0) { start=i+1;  balance=0; }
        }

        return start;
    }

    // A petrol pump has petrol and distance to next petrol pump
    static class PetrolPump
    {
        int petrol;
        int distance;

        // constructor
        public PetrolPump(int petrol, int distance)
        {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
}
