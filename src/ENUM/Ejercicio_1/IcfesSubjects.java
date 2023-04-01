package ENUM.Ejercicio_1;

    enum IcfesSubjetcs{
        MATH(5), SCIENCE(4), ENGLISH(3), LANGUAGE(5), SOCIALSTUDIES(4);

        private int value;
        private IcfesSubjetcs(int value){
            this.value=value;
        }

        public int getValue() {
            return this.value;
        }
    }
