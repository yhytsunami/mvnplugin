package tsunami;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created By yhytsunami
 * Date: 2020/11/17
 * Time: 22:04
 * Description:
 */
@Mojo(name = "helloMojo" ,defaultPhase = LifecyclePhase.INSTALL)
public class YHYMojo extends AbstractMojo {

    @Parameter(property = "application")
    private String application;
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println(application);
        System.out.println("hello maven plugin");
    }
}
