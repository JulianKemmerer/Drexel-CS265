/* Copyright (C) 1999 Lucent Technologies */
/* Excerpted from 'The Practice of Programming' */
/* by Brian W. Kernighan and Rob Pike */

/* eprintf.h: error wrapper functions */
extern	void	eprintf( char *, ... );
extern	void	weprintf( char *, ... );
extern	char	*estrdup( char * );
extern	void	*emalloc( size_t );
extern	void	*erealloc( void *, size_t );
extern	char	*progname( void );
extern	void	setProgName( char * );

#define	NELEMS(a)	(sizeof(a) / sizeof(a[0]))
