package teste17;

public class Tempo {
    private int h;
    private int m;
    private int s;

    public Tempo(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public Tempo(int tempo) {
        this.h = tempo / 3600;
        this.m = (tempo % 3600) / 60;
        this.s = (tempo % 3600) % 60;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + h;
        result = prime * result + m;
        result = prime * result + s;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tempo other = (Tempo) obj;
        if (h != other.h)
            return false;
        if (m != other.m)
            return false;
        if (s != other.s)
            return false;
        return true;
    }

    
}
