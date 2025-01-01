def clone(String clone_url, String branch_name, String message_to_print){
  git url: "${clone_url}", branch: "${branch_name}"
  echo "${message_to_print}"
}
