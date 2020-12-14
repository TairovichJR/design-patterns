package categories.creational.builder;

public class Phone {
    private String frontPanel;
    private String backPanel;
    private String processor;
    private String camera;

    private Phone (Builder builder){
        this.frontPanel = builder.frontPanel;
        this.backPanel = builder.backPanel;
        this.processor = builder.processor;
        this.camera = builder.camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "frontPanel='" + frontPanel + '\'' +
                ", backPanel='" + backPanel + '\'' +
                ", processor='" + processor + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }

    public static class Builder{

        private String frontPanel;
        private String backPanel;
        private String processor;
        private String camera;

        public Builder() {
        }

        public Builder setFrontPanel(String frontPanel) {
            this.frontPanel = frontPanel;
            return this;
        }

        public Builder setBackPanel(String backPanel) {
            this.backPanel = backPanel;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setCamera(String camera) {
            this.camera = camera;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }
}
