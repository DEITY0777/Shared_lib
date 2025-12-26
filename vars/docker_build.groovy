def call(String image, String tag, String dockerHubUser) {
  sh "docker build -t ${dockerHubUser}/${image}:${tag} ."
}
