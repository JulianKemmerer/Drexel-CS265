// MyBuildListener - playing around w/catching build events
//
// 8/06
//
// Taken from
// http://www.onjava.com/pub/a/onjava/2001/02/22/open_source.html?page=2
//

import org.apache.tools.ant.BuildListener;

public class MyBuildListener implements BuildListener
{
	public void buildStarted( BuildEvent event ) {
		System.out.println( event.getProject().getName() + ": Build started..." );
	}

	public void buildFinished( BuildEvent event ) {
		System.out.println( event.getProject().getName() + ": Build finished..." );
	}

	public void targetStarted( BuildEvent event ) {
		System.out.println( event.getTarget().getName() + ": Target started..." );
	}

	public void targetFinished( BuildEvent event ) {
		System.out.println( event.getTarget().getName() + ": Target finished..." );
	}

	public void taskStarted( BuildEvent event ) {
		System.out.println( event.getTask().getTaskName() + ": Task started..." );
	}

	public void taskFinished( BuildEvent event ) {
		System.out.println( event.getTask().getTaskName() + ": Task finished..." );
	}

	public void messageLogged( BuildEvent event ) {
		System.out.println( "A Message: " + event.getTask().getMessage() );
	}

}	// class MyBuildListener
