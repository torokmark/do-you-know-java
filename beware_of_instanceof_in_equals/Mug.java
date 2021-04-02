
public class Mug {
    private double capacity;

    public Mug(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        /* 
        if (!(o instanceof Mug)) {
            return false;
        }
        */
        if (getClass() != o.getClass()) {
            return false;
        }
        
        Mug other = (Mug) o;
        return other.capacity == this.capacity;
    }
}
