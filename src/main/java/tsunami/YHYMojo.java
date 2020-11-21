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
 *
 * 依赖maven-plugin-api，maven-plugin-annotations
 * 继承AbstractMojo
 * 注解Mojo
 * 打包类型maven-plugin
 * 表明goal前缀goalPrefix
 *
 * maven-plugin debug 通过jdwp
 * 插件运行指定debug模式运行 mvndebug groupId:artifactId:version:goal
 * 插件源码 remote attach address
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
