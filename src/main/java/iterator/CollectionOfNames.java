package iterator;

public class CollectionOfNames implements Container {
    public String names[] = {"Ashwani Rajput", "Soono Jaiswal", "Rishi Kumar", "Rahul Mehta", "Hemant Mishra"};

    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate();

    }

    public class CollectionOfNamesIterate implements Iterator {
        int i;
        @Override
        public boolean hasnext() {
            if (i < names.length) {
                return true;
            } else return false;
        }

        @Override
        public Object next() {
            if (this.hasnext()) {
                return names[i++];
            }
            return null;
        }
    }
}
