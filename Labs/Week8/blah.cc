// Looking at compiled (decorated) function names

typedef int zczc;

int myglobal;

class blah
{
	public:
	int myLocal;
	blah() : myLocal(0) {}

	int foo( zczc )
	{	myLocal++; }

	void bar()
	{ myLocal--; }
};

int main()
{
	blah b;

	b.foo( 12 );
}
