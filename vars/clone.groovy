def call(String url, String branch){
  echo "cloning the code"
  git url: "${url}", branch: "${branch}"
  echo "Code cloning successful"
}
