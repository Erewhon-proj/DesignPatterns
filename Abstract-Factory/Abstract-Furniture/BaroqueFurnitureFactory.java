public class BaroqueFurnitureFactory  implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new BaroqueChair();
    }

    @Override
    public Table createTable() {
        return new BaroqueTable();
    }
}
