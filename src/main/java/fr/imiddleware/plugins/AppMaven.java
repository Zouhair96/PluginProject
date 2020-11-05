package fr.imiddleware.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
 
/**
 * Says "Hi" to the user.
 *
 */
@Mojo( name = "hello2")
public class AppMaven extends AbstractMojo
{
    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello, maven." );
    }
}