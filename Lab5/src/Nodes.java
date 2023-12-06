public class Nodes {
    protected int idCar;
    protected String nameCar;
    protected Nodes link;

    public Nodes() {
        idCar = 0;
        nameCar = "";
        link = null;
    }

    public Nodes(int idCar, String nameCar, Nodes n) {
        this.idCar = idCar;
        this.nameCar = nameCar;
        link = n;
    }

    public void setData(int idCar) {
        this.idCar = idCar;
    }

    public void setName(String name) {
        this.nameCar = name;
    }

    public int getIdCar() {
        return idCar;
    }

    public String getNameCar(){
        return nameCar;
    }

    public Nodes getLink(){
        return link;
    }

    public void setLink(Nodes n){
        link = n;
    }
}