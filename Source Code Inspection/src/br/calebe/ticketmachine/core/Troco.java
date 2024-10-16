package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (valor >= 100) {
            valor -= 100;
            count++;
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;
        while (valor >= 50) { 
            valor -= 50;
            count++;
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor >= 20) {
            valor -= 20;
            count++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor >= 10) { 
            valor -= 10;
            count++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor >= 5) {
            valor -= 5;
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor >= 2) { 
            valor -= 2;
            count++;
        }
        papeisMoeda[0] = new PapelMoeda(2, count);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;
        protected int currentIndex = 5;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            while (currentIndex >= 0) {
                if (troco.papeisMoeda[currentIndex] != null && troco.papeisMoeda[currentIndex].getQuantidade() > 0) {
                    return true;
                }
                currentIndex--;
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            if (hasNext()) {
                ret = troco.papeisMoeda[currentIndex];
                troco.papeisMoeda[currentIndex] = null; 
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
