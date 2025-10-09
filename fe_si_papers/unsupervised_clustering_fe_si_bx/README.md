# unsupervised_clustering_fe_si_bx

## Objective
This is to document the paper "Unsupervised Clustering of Feline Small Intestinal Biopsies"
Intended for submission to Veterinary Pathology November 2025 (and Ch 3 of JMWs 
dissertation)

## Folders

- **scripts**: Contains all scripts in pipeline
- **input**: Contains input files for scripts that are not from other folders
in <judits_work_keller_lab> (mostly manually reviewed templates and what not)
- **output**: Contains outputs from each script (arranged by script name)
- **paper**: Contains paper drafts and versions
- **communication**: Contain mail threads of people to acknowledge
- **historic_versions**: Contains previous versions of this project (early draft pipeline)

## Inclusion /Exclusion
All small intestinal biopsies from cats are eligible for inclusion.

- An initial set of slides (re-used test set from a previous study, 
https://journals.sagepub.com/doi/full/10.1177/03009858241286828) 

- The main set consists of all feline small intestinal biopsies from the UC Davis
PMI archives.

Exclusion criteria are applied on a fragment to fragment basis.

All slides are evaluated by JMW prior to image analysis 
(after digitization for initial set, before digitization for main set).  
If no fragments in a slide are eligble the whole slide is excluded. 
Inclusion / exclusion of fragments within slides is automated (2.define_fragments)

### Exclusion criteria
Examples in: https://docs.google.com/presentation/d/1w_aJGpuLR2bhifiN0b8DHsDvmyqAa52ynRSX2x0R8jM/edit?usp=sharing

- Quality: to minimize noise based on biopsy quality 
  - Inadequate orientation: corresponding to a tissue that has only crypt, only villi
or only muscularis (Following Willards criteria for orientation, Willard 2008).
  - Artefact: More than 30% of the tissue in the villus crypt layer affected by artefact 
(% adopted from Cartwright 2016) (includes crush artefact (streaming nuclei),
distortion, inadequate fixation))
  - Marked fading / storage color artefact
  - Marked blurring (scanning artefact)
- Lesion: classifying unusual small intestinal patterns are beyond the scope of this study.  
Mucosa destroying lesion (ulceration, destructive mass etc.)
- Malt: Unability to identify MALT is a limitation of our current models / pipeline.
Until this is improved, the system should not be applied to fragments with MALT.
