package Ch27;

class 팥 {
    String meterial;

    팥(String meterial) {
        this.meterial = meterial;
    }

    @Override
    public String toString() {
        return "팥 [meterial =" + meterial + "]";
    }

    class 슈크림 {
        String meterial;

        슈크림(String meterial) {
            this.meterial = meterial;
        }

        @Override
        public String toString() {
            return "슈크림 [meterial =" + meterial + "]";
        }

        class 피자속 {
            String meterial;

            피자속(String meterial) {
                this.meterial = meterial;
            }

            @Override
            public String toString() {
                return "피자속 [meterial =" + meterial + "]";
            }
        }

        class 호빵<T> {
            private T meterial;

            호빵(T meterial) {
                this.meterial = meterial;
            }

            void ShowInfo() {
                System.out.println(meterial.toString());
            }
        }

        public class C01GenericMain {

            public void main(String[] args) {
                호빵 ob1 = new 호빵<팥>(new 팥("단팜"));
                ob1.ShowInfo();
                호빵 ob2 = new 호빵<슈크림>(new 슈크림("슈크림"));
                ob2.ShowInfo();
            }

        }
    }
}

