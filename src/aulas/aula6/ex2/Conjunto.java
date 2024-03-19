package aulas.aula6.ex2;

public class Conjunto {
    
    private int[] vector = new int[0];

    public void insert(int n) {
        if (!this.contains(n)) {
            int[] newVector = new int[this.size() + 1];
            for (int i = 0; i < this.size() ; i++) {
                newVector[i] = this.vector[i];
            }
            newVector[newVector.length - 1] = n;
            this.vector = newVector;
        }
    }

    public boolean contains(int n) {
        for (int i = 0; i < this.size() ; i++) {
            if (this.vector[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void remove(int n) {
        if (this.contains(n)) {
            int[] newVector = new int[this.size() - 1];
            int j = 0;
            for (int i = 0; i < this.size() ; i++) {
                if (this.vector[i] != n) {
                    newVector[j] = this.vector[i];
                    j++;
                }
            }
            this.vector = newVector;
        }
    }

    public void empty() {
        this.vector = new int[0];
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.size() ; i++) {
            s += this.vector[i] + " ";
        }
        return s;
    }

    public int size() {
        return this.vector.length;
    }

    public Conjunto combine(Conjunto add) {
        Conjunto c = new Conjunto();
        for (int i = 0; i < this.size() ; i++) {
            c.insert(this.vector[i]);
        }
        for (int i = 0; i < add.size() ; i++) {
            c.insert(add.vector[i]);
        }
        return c;
    }

    public Conjunto subtract(Conjunto dif) {
        Conjunto c = new Conjunto();
        for (int i = 0; i < this.size() ; i++) {
            if (!dif.contains(this.vector[i])) {
                c.insert(this.vector[i]);
            }
        }
        return c;
    }

    public Conjunto intersect(Conjunto inter) {
        Conjunto c = new Conjunto();
        for (int i = 0; i < this.size() ; i++) {
            if (inter.contains(this.vector[i])) {
                c.insert(this.vector[i]);
            }
        }
        return c;
    }
}
