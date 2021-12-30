import java.util.*;

public class PythagoreanTriplet {
    int a = 1;
    int b = 1;
    int c;
    static List<PythagoreanTriplet> triplets = new ArrayList<>();

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PythagoreanTriplet() {
    }

    @Override
    public boolean equals(Object o) {
      
        PythagoreanTriplet p = (PythagoreanTriplet) o;
        return a == p.a && b == p.b && c == p.c;
    }


    public static PythagoreanTriplet makeTripletsList() {
        triplets.clear();
        return new PythagoreanTriplet();
    }
    public List<PythagoreanTriplet> build() {
        int N = a+b+c;
        for (int i = 1; i <= N / 3; i++)
        {
            for (int j = i + 1; j <= N / 2; j++)
            {
                int k = N - i - j;
                if (i * i + j * j == k * k)
                {
                    triplets.add(new PythagoreanTriplet(i,j,k));
                }
            }
        }
        return triplets;
    }
    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int factMax) {
        if (a < factMax / 2) {
            if (a <= b) {
                b++;
            }
            if (b == factMax) {
                a++;
                b = a + 1;
            }
        }
        return this;
    }
    

    public PythagoreanTriplet thatSumTo(int sumMax) {
        while (a < sumMax/2 && (Math.pow(a, 2) + Math.pow(b, 2)) != Math.pow((sumMax - a - b), 2)) {
            withFactorsLessThanOrEqualTo(sumMax);
        }
        if (a < sumMax / 2) {
            c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        }
        return this;
    }


}
