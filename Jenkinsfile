pipeline {
    agent any
    tools {
        maven 'Maven 3.5.4'
        jdk 'jdk8'
        docker 'docker'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn -f demo/pom.xml -Dmaven.test.skip=true clean package'
            }
        }
        
        stage ('Deploy') {
            steps {
                sh 'docker cp /var/jenkins_home/workspace/Deploy-war/demo/target/web-thymeleaf-1.0.war tomcat-server:/usr/local/tomcat/webapps'
            }
        }
	}
}