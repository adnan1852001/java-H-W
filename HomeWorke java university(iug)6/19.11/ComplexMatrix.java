class ComplexMatrix extends GenericMatrix<ComplexNumber> {

    @Override
    protected ComplexNumber add(ComplexNumber o1, ComplexNumber o2) {
        return o1.add(o2);
    }

    @Override
    protected ComplexNumber multiple(ComplexNumber o1, ComplexNumber o2) {
        return o1.multiple(o2);
    }

    @Override
    protected ComplexNumber zero() {
        return new ComplexNumber(0);
    }

}