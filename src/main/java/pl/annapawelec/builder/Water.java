package pl.annapawelec.builder;

public class Water {
    private String name;
    private int magnesiumLevel;
    private int calciumLevel;
    private int saltLevel;
    private String producent;
    private int fluorLevel;

    private Water(WaterBuilder waterBuilder) {
        this.name = waterBuilder.name;
        this.magnesiumLevel = waterBuilder.magnesiumLevel;
        this.calciumLevel = waterBuilder.calciumLevel;
        this.saltLevel = waterBuilder.saltLevel;
        this.producent = waterBuilder.producent;
        this.fluorLevel = waterBuilder.fluorLevel;
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", magnesiumLevel=" + magnesiumLevel +
                ", calciumLevel=" + calciumLevel +
                ", saltLevel=" + saltLevel +
                ", producent='" + producent + '\'' +
                ", fluorLevel=" + fluorLevel +
                '}';
    }

    public static class WaterBuilder {
        private String name;
        private int magnesiumLevel;
        private int calciumLevel;
        private int saltLevel;
        private String producent;
        private int fluorLevel;

        public WaterBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public WaterBuilder setMagnesiumLevel(int magnesiumLevel) {
            this.magnesiumLevel = magnesiumLevel;
            return this;
        }

        public WaterBuilder setCalciumLevel(int calciumLevel) {
            this.calciumLevel = calciumLevel;
            return this;
        }

        public WaterBuilder setSaltLevel(int saltLevel) {
            this.saltLevel = saltLevel;
            return this;
        }

        public WaterBuilder setProducent(String producent) {
            this.producent = producent;
            return this;
        }

        public WaterBuilder setFluorLevel(int fluorLevel) {
            this.fluorLevel = fluorLevel;
            return this;
        }

        public Water build() {
            return new Water(this);
        }
    }

}
