pipeline {

	agent any
	stages{
		stage('Checkout Codebase'){
			steps{
				cleanWs()
				checkout scm: [$class: 'GitSCM', branches: [[name:'*/master']],
				 userRemoteConfigs: [[url:'git@github.com:wardjar/AutomationTests.git']]
			}
			 stage('Build'){
			 steps{
			 javac firstTest.java //compile your test class 
			 java firstTest // run your test class
			 }
			 
			 }
			
		}
	}
}
