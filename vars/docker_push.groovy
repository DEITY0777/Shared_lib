def call(String image, String tag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockercred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUser}/${image}:${tag}"
} 
