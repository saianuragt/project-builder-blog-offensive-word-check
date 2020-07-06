package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String bad_words[]={"anal","anus","arse","ass","ass fuck","ass hole","assfucker","asshole","assshole","bastard","bitch",
			"black cock","bloody hell","boong","cock","cockfucker","cocksuck","cocksucker","coon","coonnass","crap","cunt",
			"cyberfuck","damn","darn","dick","dirty","douche","dummy","erect","erection","erotic","escort","fag","faggot","fuck","Fuck off","fuck you",
			"fuckass","fuckhole","god damn","gook","hard core","hardcore","homoerotic","hore","lesbian","lesbians","mother fucker","motherfuck"};
	@Override
	public boolean checkBlogTitle(Blog blog) {
		String title=blog.getBlogTitle();
		 for(int i=0;i<bad_words.length;i++) {
			 if(title.contains(bad_words[i])) {
				 return false;
			 }
		}
		return true;
	}
	
	@Override
	public boolean checkBlogDescription(Blog blog) {
		String description = blog.getBlogDescription();
		 for(int i=0;i<bad_words.length;i++) {
			 if(description.contains(bad_words[i])) {
				 return false;
			 }
		}
		return true;
	}
	
	@Override
	public boolean checkBlog(Blog blog) {
		if (checkBlogTitle(blog) && checkBlogDescription(blog))
			return true;
		else
			return false;
	}

	
}