package unit9GenericsInDepth.C2;

interface IOtherInterface<T>{}

interface ITypeInterface{}

public class ClassN implements IOtherInterface<Integer> { //Its necessary replace T with wrapper (Object class) like Integer or even Interface
}

class Class1 {}

class Class2 implements IOtherInterface<ITypeInterface> { //Its necessary replace T with wrapper (Object class) like Integer or even Interface
}

class Class3 extends Class1 {}
class Class4 extends Class3 implements IOtherInterface<String>{}
class Class5<T> extends Class1 {}

class Class6<T> implements IOtherInterface<T> {
}

class Class7<T> extends Class6<T> implements IOtherInterface<T> {
}

class Class8<T> extends Class1 implements IOtherInterface<String> {
}

/**
 * NOT ALLOWED
 *
 *      For colission between the same interface IOtherInterface that implements and Interface in Class extend
 *
 *      class Class9<T> extends Class6<T> implements IOtherInterface<String> {
 *      }
 *
 *      class Class10<T> extends Class2 implements IOtherInterface<String> {
 *      }
 *
 */