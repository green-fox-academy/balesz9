package blogpost;

public class BlogPostClasses {
    public static void main(String[] args) {
        BlogPost firstBlogPost = new BlogPost();
        firstBlogPost.authorName = "John Doe";
        firstBlogPost.title = "Lorem Ipsum";
        firstBlogPost.publicationDate = "2000.05.04.";
        firstBlogPost.text = "Lorem ipsum dolor sit amet.";
        firstBlogPost.introduceBook();

        BlogPost secondBlogPost = new BlogPost();
        secondBlogPost.authorName = "Tim Urban";
        secondBlogPost.title = "Wait but why";
        secondBlogPost.publicationDate = "2010.10.10.";
        secondBlogPost.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        secondBlogPost.introduceBook();

        BlogPost thirdBlogPost = new BlogPost();
        thirdBlogPost.authorName = "William Turton";
        thirdBlogPost.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        thirdBlogPost.publicationDate = "2017.03.28.";
        thirdBlogPost.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really " +
                "into the whole organizer profile thing.";
        thirdBlogPost.introduceBook();

    }

}
