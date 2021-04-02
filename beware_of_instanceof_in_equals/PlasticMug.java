
public class PlasticMug extends Mug {
    private String plastic;
    public PlasticMug(double capacity, String plastic) {
        super(capacity);
        this.plastic = plastic;
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
        if (!(o instanceof PlasticMug)) {
            return false;
        }*/
        if (getClass() != o.getClass()) {
            return false;
        }
        PlasticMug other = (PlasticMug) o;
        return other.getCapacity() == this.getCapacity() && other.plastic.equals(plastic);
    }
}
