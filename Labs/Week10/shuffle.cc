/* File: sort4.cpp
 * Author: Jeremy Johnson 
 *
 * Description:
 *   This program reads a sequence of strings and stores them in a vector of
 *   strings.  The vector is randomly shuffled and the shuffled vector is
 *   printed to standard output.
 *
 * Notes:
 *   The random_shuffle function from STL is used.
 *
 */

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector<string> words;
	string buf;
	
	while( cin >> buf )
	{
		words.push_back(buf);
	}

	random_shuffle( words.begin(),words.end() );

	for( int i=0; i<words.size(); i++ )
          cout << words[i] << endl;

	return 0;
}
