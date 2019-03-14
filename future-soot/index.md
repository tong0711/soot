## The FutureSoot project

FutureSoot is a three-years project, which started in 2018, and is funded by the DFG's funding line on [Research Software Sustainability](http://www.dfg.de/en/research_funding/programmes/infrastructure/lis/funding_opportunities/call_proposal_software/). The project provides us funding to both give Soot a major architectural overhaul, and also to develop a sustainability plan that allows us to finance the further development and maintenance of Soot in the future.

# What concrete goals do we have with FutureSoot?

We are currently developing a brand-new version of Soot, currently still in a private branch. This new version will enable people to use Soot in a much more flexible manner. Particularly, we are implementing the following major, breaking changes:
* We will get rid of most singletons, allowing for a much more decoupled, modular design.
* This, in turn, will allow us to parallelize certain operations, e.g. the converison to Jimple, which will be realized through actors.
* We have teamed up with Julian Dolby to integrate Soot with WALA's source code frontends. This will not only allow Soot to analyze more current Java code, but also JavaScript and Python.
* The Jimple IR will undergo slight changes to accommodate those different languages. Also we will make it immutable by design, such that currently expensive lookups can be more effectively cached. Jimple-modification will still be possible, though, when needed.
* When getting rid of singletons we will also abolish the concept of a single Scene. Instead one will have the opportunity to have different views on the code, that can reflect, for instance, different versions of the same code base, or a number of code bases, all in the same Soot instance. The various analyses can relate to those views.

# Principal investigators
* Eric Bodden, Chair of Software Engineering at Paderborn University
* Rüdiger Kabst, Chair of International Business at Paderborn University

# Project team
* TODO fill out