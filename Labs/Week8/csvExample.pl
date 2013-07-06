#!/usr/bin/perl
# csvExample.pl - simple example, parsing a CSV file
#
# Kurt Schmidt
#
# Mar '06
#
# DEMONSTRATES - module Text, module Text::CSV, <>, $_, array
#


use strict;
use warnings;

use Text::CSV_XS;

my $csv = Text::CSV_XS->new();              # create a new object

while( <> )
{
	my $status = $csv->parse( $_ );         # parse a CSV string into fields
	my @columns = $csv->fields();            # get the parsed fields

	foreach( @columns )
	{
		print $_."\n";
	}
	print "\n";
}

