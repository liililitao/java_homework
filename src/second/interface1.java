package second;

interface interface1 {
	void print1();
	void print2();
}

interface interface2 {
	void print3();
	void print4();
}

interface interface3 extends interface1, interface2 {
	void print5();
}