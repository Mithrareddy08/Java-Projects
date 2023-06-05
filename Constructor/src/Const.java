class Const {

        protected int constVariable;
        public Const(int constVariable)
        {
            this.constVariable = constVariable;
        }
    }
    // derived class
    class  Const1 extends Const {

        protected int Const1variable;

        public Const1(int constVariable, int const1variable) {
            super(constVariable);
            this.constVariable = constVariable;
        }

        public Const1(int const1variable) {
            super(0);
            this.Const1variable = const1variable;
        }

    }


