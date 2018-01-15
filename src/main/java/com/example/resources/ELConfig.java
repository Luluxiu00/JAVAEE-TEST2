package com.example.resources;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.example.resources")
@PropertySource(value="t.properties",encoding="UTF-8")
public class ELConfig {
	
	@Value("I love you!")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{systemEnvironment['os.arch']}")
	private String osArch;
	
	@Value("#{T(java.lang.Math).random()*100}")
	private double randomNumber;
	
	@Value("#{demoService1.author}")
	private String author;
	
	@Value("t.txt")
	private Resource testFile;
	
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Value("${sang.username}")
	private String username;
	    
	@Value("${sang.passwd}")
	private String passwd;
	    
	@Value("${sang.nickname}")
	private String nickname;
	
	@Autowired
    private Environment environment;
	
	
	public void output() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(osArch);
            System.out.println(randomNumber);
            System.out.println(author);
            System.out.println(IOUtils.toString(testFile.getInputStream(),"UTF-8"));
            //访问网址
            System.out.println(IOUtils.toString(testUrl.getInputStream(),"UTF-8"));
            //获取网址
            System.out.println("testUrl.getURL():"+testUrl.getURL());
            System.out.println(username);
            System.out.println(passwd);
            System.out.println(nickname);
            System.out.println(environment.getProperty("sang.nickname"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
