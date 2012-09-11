package com.liquable.deco.analyze;

public class AnalyzeService implements IAnalyzeService
{

    private final AnalyzeContentManager analyzeContentManager;

    private final StickerCodeManager stickerCodeManager;

    private AnalyzeService(final AnalyzeContentManager analyzeContentManager,
        final StickerCodeManager stickerCodeManager)
    {
        this.analyzeContentManager = analyzeContentManager;
        this.stickerCodeManager = stickerCodeManager;
    }

    @Override
    public String getStickerCodesbyContent(final String content)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
