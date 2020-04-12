pipeline{
	agent any
	stages{
		stage ('check-out'){
			steps{
				echo "checking out from git repository";
				git 'https://github.com/madhuinala/mavenmultimodule.git';
			}
		}
		stage ('smoke test'){
			steps{
				echo "this is smoke test execution";
				//readMavenPom file: '/Child2Demo/pom.xml';
				sh "mvn compile test -Dsurefire.suiteXmlFiles=smoke.xml";
			}
		}
		stage ('sanity test'){
			steps{
				echo "this is sanity test execution";
				//readMavenPom file: '/Child2Demo/pom.xml';
				sh "mvn test -Dsurefire.suiteXmlFiles=sanity.xml";
			}
		}
		
	}
}
