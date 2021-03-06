package fr.imiddleware.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
 
/**
 * Says "Hi" to the user.
 *
 */
@Mojo( name = "hello1")
public class AppJava extends AbstractMojo
{
    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello, java." );
    }
}