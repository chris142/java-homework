package task8;

class LCG {

    private long a; // multiplier
    private long c; // increment
    private long m; // modulus

    LCG(long a, long c, long m) {

        this.a = a;
        this.c = c;
        this.m = m;
    }

    long getNext(long prev) {
        return (this.a * prev + this.c) % this.m;
    }
}