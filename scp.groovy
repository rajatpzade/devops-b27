node {  
    stage('pull') { 
        git 'https://github.com/rajatpzade/studentapp.ui.git'
    }
    stage('build') { 
        echo 'build successfull'
    }
    stage('test') { 
        echo 'test successfull'
    }
    stage('Deploy') { 
        echo 'deploy successfull'
    }
}